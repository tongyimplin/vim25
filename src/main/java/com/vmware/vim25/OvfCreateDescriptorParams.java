package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.OvfCreateDescriptorParams;
import com.vmware.vim25.OvfFile;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OvfCreateDescriptorParams", propOrder = {"ovfFiles", "name", "description", "includeImageFiles", "exportOption", "snapshot"})
public class OvfCreateDescriptorParams extends DynamicData {
  protected List<OvfFile> ovfFiles;
  
  protected String name;
  
  protected String description;
  
  protected Boolean includeImageFiles;
  
  protected List<String> exportOption;
  
  protected ManagedObjectReference snapshot;
  
  public List<OvfFile> getOvfFiles() {
    if (this.ovfFiles == null)
      this.ovfFiles = new ArrayList<>(); 
    return this.ovfFiles;
  }
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public String getDescription() {
    return this.description;
  }
  
  public void setDescription(String paramString) {
    this.description = paramString;
  }
  
  public Boolean isIncludeImageFiles() {
    return this.includeImageFiles;
  }
  
  public void setIncludeImageFiles(Boolean paramBoolean) {
    this.includeImageFiles = paramBoolean;
  }
  
  public List<String> getExportOption() {
    if (this.exportOption == null)
      this.exportOption = new ArrayList<>(); 
    return this.exportOption;
  }
  
  public ManagedObjectReference getSnapshot() {
    return this.snapshot;
  }
  
  public void setSnapshot(ManagedObjectReference paramManagedObjectReference) {
    this.snapshot = paramManagedObjectReference;
  }
}
