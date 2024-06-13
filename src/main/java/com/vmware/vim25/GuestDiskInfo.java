package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.GuestDiskInfo;
import com.vmware.vim25.GuestInfoVirtualDiskMapping;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuestDiskInfo", propOrder = {"diskPath", "capacity", "freeSpace", "filesystemType", "mappings"})
public class GuestDiskInfo extends DynamicData {
  protected String diskPath;
  
  protected Long capacity;
  
  protected Long freeSpace;
  
  protected String filesystemType;
  
  protected List<GuestInfoVirtualDiskMapping> mappings;
  
  public String getDiskPath() {
    return this.diskPath;
  }
  
  public void setDiskPath(String paramString) {
    this.diskPath = paramString;
  }
  
  public Long getCapacity() {
    return this.capacity;
  }
  
  public void setCapacity(Long paramLong) {
    this.capacity = paramLong;
  }
  
  public Long getFreeSpace() {
    return this.freeSpace;
  }
  
  public void setFreeSpace(Long paramLong) {
    this.freeSpace = paramLong;
  }
  
  public String getFilesystemType() {
    return this.filesystemType;
  }
  
  public void setFilesystemType(String paramString) {
    this.filesystemType = paramString;
  }
  
  public List<GuestInfoVirtualDiskMapping> getMappings() {
    if (this.mappings == null)
      this.mappings = new ArrayList<>(); 
    return this.mappings;
  }
}
