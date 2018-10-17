// Exported from:        http://Gauravs-MacBook-Pro.local:5516/#/templates/Folderda658fedcd344ebeb88f406750ccbf28-Releasee248d59e7e1e44d181c5ac697f5ecfa7/releasefile
// XL Release version:   8.2.0
// Date created:         Wed Oct 17 11:51:45 EDT 2018

xlr {
  template('master') {
    folder('ORT')
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2018-10-06T09:00:00-0400')
    phases {
      phase('New Phase') {
        tasks {
          custom('test') {
            owner 'admin'
            script {
              type 'xldeploy.Deploy'
              server 'xldlocal'
              username 'admin'
              retryCounter 'currentContinueRetrial':'0','currentPollingTrial':'0'
              deploymentApplication 'application-test'
              deploymentVersion 'pac1'
              deploymentPackage 'application-test/pac1'
              deploymentEnvironment 'Environments/test'
            }
          }
          manual('stop') {
            
          }
          custom('test') {
            owner 'admin'
            script {
              type 'xld.CreateCI'
              server 'xldlocal'
              username 'admin'
              password '{b64}924thT+g8nqkXWZbLjmX3g=='
              ciID 'Infrastructure/Information-Technology'
              ciType 'core.directory'
              addToEnvironment false
            }
          }
          custom('test (copy)') {
            owner 'admin'
            script {
              type 'xld.CreateCI'
              server 'xldlocal'
              username 'admin'
              password '{b64}924thT+g8nqkXWZbLjmX3g=='
              ciID 'Infrastructure/Information-Technology/sshhost'
              ciType 'overthere.SshHost'
              xmlDescriptor '<os>UNIX</os>\n' +
                            '<connectionType>SUDO</connectionType>\n' +
                            '<address>192.31.33.44</address>\n' +
                            '<port>22</port>\n' +
                            '<username>Zdeploy</username>\n' +
                            '<password>password</password>\n' +
                            '<temporaryDirectoryPath>/tmp</temporaryDirectoryPath>\n' +
                            '<stagingDirectoryPath>/tmp</stagingDirectoryPath>\n' +
                            '<sudoUsername>tomcat</sudoUsername>\n' +
                            '<deploymentGroup>1</deploymentGroup>'
              addToEnvironment false
            }
          }
          manual('d') {
            
          }
        }
      }
    }
    
  }
}