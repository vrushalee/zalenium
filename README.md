# Zalenium
This is a Selenium Grid extension to scale your local grid dynamically with docker containers. It uses docker-selenium to run your tests in Firefox and Chrome locally, if you need a different browser, your tests can get redirected to a cloud testing provider (Sauce Labs, BrowserStack, TestingBot). Zalenium also works out of the box in Kubernetes.

Zalenium's maintainers add new features regularly. We invite you to test it, report bugs, suggest any ideas you may have, and contribute. See our contributing guidelines for more details.


# What does Zalenium mean?
As you can imagine, it is the result of mixing Zalando and Selenium. As mentioned before, this project's aim is to provide a simple way to create a grid and contribute to the Selenium community. Nevertheless, this is not an official Selenium project. We kindly ask you to create issues in this repository. If you have questions about how to get started, please join the #zalenium channel on Slack.

# To pull all images and run zalenium
Execute dockerZalenium.bat

# To run test suite execute below 
mvn clean test -DsuiteXmlFile=testng-docker-zalenium.xml

# Live preview of your running tests
http://localhost:4444/grid/admin/live

# See all the videos and aggregated logs after your tests completed. 
http://localhost:4444/dashboard

# Stop Zalenium
docker stop zalenium