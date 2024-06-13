package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.FileInfo;
import com.vmware.vim25.HostDatastoreBrowserSearchResults;
import com.vmware.vim25.ManagedObjectReference;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostDatastoreBrowserSearchResults", propOrder = {"datastore", "folderPath", "file"})
public class HostDatastoreBrowserSearchResults extends DynamicData {
  protected ManagedObjectReference datastore;
  
  protected String folderPath;
  
  protected List<FileInfo> file;
  
  public ManagedObjectReference getDatastore() {
    return this.datastore;
  }
  
  public void setDatastore(ManagedObjectReference paramManagedObjectReference) {
    this.datastore = paramManagedObjectReference;
  }
  
  public String getFolderPath() {
    return this.folderPath;
  }
  
  public void setFolderPath(String paramString) {
    this.folderPath = paramString;
  }
  
  public List<FileInfo> getFile() {
    if (this.file == null)
      this.file = new ArrayList<>(); 
    return this.file;
  }
}
