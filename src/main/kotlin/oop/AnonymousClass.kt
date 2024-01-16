package oop

interface AnonymousClass {
    fun onDownloadStarted()
    fun onDownloadCompltet(file: String)
    fun onProgressUpdate(progress: Int)
}