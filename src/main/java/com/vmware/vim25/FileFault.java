package com.vmware.vim25;

import com.vmware.vim25.CannotAccessFile;
import com.vmware.vim25.CannotCreateFile;
import com.vmware.vim25.CannotDeleteFile;
import com.vmware.vim25.DirectoryNotEmpty;
import com.vmware.vim25.FileAlreadyExists;
import com.vmware.vim25.FileFault;
import com.vmware.vim25.FileLocked;
import com.vmware.vim25.FileNameTooLong;
import com.vmware.vim25.FileNotFound;
import com.vmware.vim25.FileNotWritable;
import com.vmware.vim25.FileTooLarge;
import com.vmware.vim25.IncorrectFileType;
import com.vmware.vim25.NetworkCopyFault;
import com.vmware.vim25.NoDiskSpace;
import com.vmware.vim25.NotADirectory;
import com.vmware.vim25.NotAFile;
import com.vmware.vim25.TooManyConcurrentNativeClones;
import com.vmware.vim25.TooManyNativeCloneLevels;
import com.vmware.vim25.TooManyNativeClonesOnFile;
import com.vmware.vim25.VimFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileFault", propOrder = {"file"})
@XmlSeeAlso({NetworkCopyFault.class, FileNotFound.class, FileLocked.class, CannotCreateFile.class, FileNameTooLong.class, FileNotWritable.class, CannotAccessFile.class, FileTooLarge.class, NotADirectory.class, TooManyConcurrentNativeClones.class, CannotDeleteFile.class, IncorrectFileType.class, NoDiskSpace.class, NotAFile.class, TooManyNativeClonesOnFile.class, TooManyNativeCloneLevels.class, FileAlreadyExists.class, DirectoryNotEmpty.class})
public class FileFault extends VimFault {
  @XmlElement(required = true)
  protected String file;
  
  public String getFile() {
    return this.file;
  }
  
  public void setFile(String paramString) {
    this.file = paramString;
  }
}
