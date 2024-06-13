package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.StorageResourceManagerStorageProfileStatistics;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StorageResourceManagerStorageProfileStatistics", propOrder = {"profileId", "totalSpaceMB", "usedSpaceMB"})
public class StorageResourceManagerStorageProfileStatistics extends DynamicData {
  @XmlElement(required = true)
  protected String profileId;
  
  protected long totalSpaceMB;
  
  protected long usedSpaceMB;
  
  public String getProfileId() {
    return this.profileId;
  }
  
  public void setProfileId(String paramString) {
    this.profileId = paramString;
  }
  
  public long getTotalSpaceMB() {
    return this.totalSpaceMB;
  }
  
  public void setTotalSpaceMB(long paramLong) {
    this.totalSpaceMB = paramLong;
  }
  
  public long getUsedSpaceMB() {
    return this.usedSpaceMB;
  }
  
  public void setUsedSpaceMB(long paramLong) {
    this.usedSpaceMB = paramLong;
  }
}
