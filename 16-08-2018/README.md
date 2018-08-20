# 16-08-2018

Reading from yesterday:
Use CI tools like Jenkins to handle the automatic creation of your build artifacts, and make sure they
are tagged properly, so a release can be linked back to a certain version of the code.

Use tools like Vagrant and Puppet to automate the deployment of your software.
Vagrant handles virtual server creation, while Puppet handles the actually installation of
the middleware and actual software (This includes things like firewall rules.)

Things the company should do:

* Define "DONE"
* Version control EVERYTHING
* CI (e.g. Jenkins)
  * Start by building
  * Automatic unit test
  * Automatic integration tests
  * Automatic acceptance tests
* Automatic deployments
* Break down the solis (Combine ops and development)
* Gather metrics