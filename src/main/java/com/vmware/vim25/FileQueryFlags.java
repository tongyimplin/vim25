package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.FileQueryFlags;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileQueryFlags", propOrder = {"fileType", "fileSize", "modification", "fileOwner"})
public class FileQueryFlags extends DynamicData {
  protected boolean fileType;
  
  protected boolean fileSize;
  
  protected boolean modification;
  
  protected Boolean fileOwner;
  
  public boolean isFileType() {
    return this.fileType;
  }
  
  public void setFileType(boolean paramBoolean) {
    this.fileType = paramBoolean;
  }
  
  public boolean isFileSize() {
    return this.fileSize;
  }
  
  public void setFileSize(boolean paramBoolean) {
    this.fileSize = paramBoolean;
  }
  
  public boolean isModification() {
    return this.modification;
  }
  
  public void setModification(boolean paramBoolean) {
    this.modification = paramBoolean;
  }
  
  public Boolean isFileOwner() {
    return this.fileOwner;
  }
  
  public void setFileOwner(Boolean paramBoolean) {
    this.fileOwner = paramBoolean;
  }
}
