def call() {
    echo "Cleaning up workspace..."
    try {
        cleanWs()
        echo "Workspace cleanup successful."
    } catch (err) {
        echo "Workspace cleanup failed: ${err.getMessage()}"
        error("Aborting pipeline due to cleanup failure.")
    }
}


