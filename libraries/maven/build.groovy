void call(){
    stage("Maven: Build") {
        if (stageContext.name) {
            echo "Running from ${stageContext.name}"
            stageContext.args.each { entry -> println "${entry.key}=${entry.value}" }
        }
        println "build from the maven library"
    }
}

