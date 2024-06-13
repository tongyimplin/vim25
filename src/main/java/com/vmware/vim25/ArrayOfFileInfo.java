package com.vmware.vim25;

import com.vmware.vim25.ArrayOfFileInfo;
import com.vmware.vim25.FileInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFileInfo", propOrder = {"fileInfo"})
public class ArrayOfFileInfo {
  @XmlElement(name = "FileInfo")
  protected List<FileInfo> fileInfo;
  
  public List<FileInfo> getFileInfo() {
    if (this.fileInfo == null)
      this.fileInfo = new ArrayList<>(); 
    return this.fileInfo;
  }
}
