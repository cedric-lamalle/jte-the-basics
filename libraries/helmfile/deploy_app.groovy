void call(app_env) {
    stage("Helmfile Deploy"){
        println "Deploy from Helmfile from URL: ${config.configurationUrl} from Dir: ${app_env.configurationDir}"
    }
}

