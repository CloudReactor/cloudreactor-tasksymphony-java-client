# tasksymphony-wrapper-io

![Tests](https://github.com/CloudReactor/tasksymphony-wrapper-io/workflows/Tests/badge.svg?branch=master)

This Java project allows JVM processes to communicate with the 
wrapper script, so they can send updates to the CloudReactor API
server.

Example usage:

    TaskStatusUpdater statusUpdater = new TaskStatusUpdater()
    
        