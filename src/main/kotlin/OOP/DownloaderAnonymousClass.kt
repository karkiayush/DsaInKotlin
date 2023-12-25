package OOP

class DownloaderAnonymousClass {

    val downloadListener: AnonymousClass? = null
    fun downloadFile(file: String) {

        downloadListener?.onDownloadStarted()

        for (i in 1..10) {
            Thread.sleep(1000)
            downloadListener?.onProgressUpdate(i * 10)
        }

        downloadListener?.onDownloadCompltet(file)
    }
}