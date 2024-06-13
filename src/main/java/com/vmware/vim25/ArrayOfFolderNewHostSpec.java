package com.vmware.vim25;

import com.vmware.vim25.ArrayOfFolderNewHostSpec;
import com.vmware.vim25.FolderNewHostSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFolderNewHostSpec", propOrder = {"folderNewHostSpec"})
public class ArrayOfFolderNewHostSpec {
  @XmlElement(name = "FolderNewHostSpec")
  protected List<FolderNewHostSpec> folderNewHostSpec;
  
  public List<FolderNewHostSpec> getFolderNewHostSpec() {
    if (this.folderNewHostSpec == null)
      this.folderNewHostSpec = new ArrayList<>(); 
    return this.folderNewHostSpec;
  }
}
