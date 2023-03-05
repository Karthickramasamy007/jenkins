# Source: https://www.youtube.com/watch?v=Wj-weFEsTb0&t=598s


# CONFIGURE GLOBAL PIPELINE LIBRARY IN JENKINS
- go to configurations --> Global pipeline Libraries --> LibName : "shared-library" (this is the name you should mettion in jenins
    file to call the global lib) --> Default version : "master"
- modern scm --> SCM --> put gloab lib git url here https://github.com/Karthickramasamy007/jenkins.git
- library path : "groovy-global-shared-lib" and click ok
- if you come bac to main menu and go back to configurations --> global pipeline libraries --> Here you can see "Currently maps to revision: 7547e41befb25b62cb1d5ca179a4fbc0e9a6d122".
- this refferes wich git commit it refferes to.
- this library will be available for all the pipeline in your jenkins you can use if you want.