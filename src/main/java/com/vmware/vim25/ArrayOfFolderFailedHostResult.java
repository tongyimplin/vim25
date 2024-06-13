package com.vmware.vim25;

import com.vmware.vim25.ArrayOfFolderFailedHostResult;
import com.vmware.vim25.FolderFailedHostResult;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFolderFailedHostResult", propOrder = {"folderFailedHostResult"})
public class ArrayOfFolderFailedHostResult {
  @XmlElement(name = "FolderFailedHostResult")
  protected List<FolderFailedHostResult> folderFailedHostResult;
  
  public List<FolderFailedHostResult> getFolderFailedHostResult() {
    if (this.folderFailedHostResult == null)
      this.folderFailedHostResult = new ArrayList<>(); 
    return this.folderFailedHostResult;
  }
}
