package com.vmware.vim25;

import com.vmware.vim25.FileFault;
import com.vmware.vim25.FileTooLarge;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileTooLarge", propOrder = {"datastore", "fileSize", "maxFileSize"})
public class FileTooLarge extends FileFault {
  @XmlElement(required = true)
  protected String datastore;
  
  protected long fileSize;
  
  protected Long maxFileSize;
  
  public String getDatastore() {
    return this.datastore;
  }
  
  public void setDatastore(String paramString) {
    this.datastore = paramString;
  }
  
  public long getFileSize() {
    return this.fileSize;
  }
  
  public void setFileSize(long paramLong) {
    this.fileSize = paramLong;
  }
  
  public Long getMaxFileSize() {
    return this.maxFileSize;
  }
  
  public void setMaxFileSize(Long paramLong) {
    this.maxFileSize = paramLong;
  }
}
