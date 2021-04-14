package com.microsoft.graphdataconnect.skillsfinder.replyextractor.job.helpers

import org.apache.hadoop.fs.{FileSystem, Path, RemoteIterator}

trait BlobFileHelper {

  implicit val fileSystem: FileSystem

  def listDirectory(fullPath: String, recursive: Boolean = false): Seq[String] = {
    val it = fileSystem.listFiles(new Path(fullPath), recursive)
    it.toList.map(x => x.getPath.toString)
  }

  private implicit def convertToScalaIterator[T](underlying: RemoteIterator[T]): Iterator[T] = {
    case class wrapper(underlying: RemoteIterator[T]) extends Iterator[T] {
      override def hasNext: Boolean = underlying.hasNext

      override def next: T = underlying.next
    }
    wrapper(underlying)
  }

}
