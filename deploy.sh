rm -rf target
rm dependency-reduced-pom.xml
ls

port_number=$1
if ! [[ -f "./mvnw" ]]; then
  echo "The './mvnw' file does not exist. Running 'mvn -N wrapper:wrapper'..."
  mvn -N wrapper:wrapper
fi

project_version=`./mvnw help:evaluate -Dexpression=project.version -q -DforceStdout`
project_name=`./mvnw help:evaluate -Dexpression=project.name -q -DforceStdout`
project_groupId=`./mvnw help:evaluate -Dexpression=project.groupId -q -DforceStdout`
project_artifactId=`./mvnw help:evaluate -Dexpression=project.artifactId -q -DforceStdout`
project_version=`./mvnw help:evaluate -Dexpression=project.version -q -DforceStdout`
package_cloud_username=""
package_cloud_packagename=""
read -p "Enter PackageCloud username: " package_cloud_username
read -p "Enter PackageCloud package name: " package_cloud_packagename

./mvnw package -Dmaven.test.skip=true
package_cloud push $package_cloud_username/$package_cloud_packagename ./target/$project_artifactId-$project_version.jar --coordinates=$project_groupId:$project_artifactId:$project_version