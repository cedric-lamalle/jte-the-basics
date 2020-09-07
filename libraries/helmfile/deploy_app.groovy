void call(app_env) {
    def runDiff = true
    if(config.containsKey("runDiff")) {
      runDiff = config.runDiff
    } 
    stage("Helmfile Deploy"){
      if (runDiff) {
        println "Running diff before applying..."
      }
      println "Deploy from Helmfile from URL: ${config.configurationUrl} from Dir: ${app_env.configurationDir}"
    }
}

