package com.vmware.vim25;

import com.vmware.vim25.VirtualDeviceConfigSpec;
import com.vmware.vim25.VirtualDiskConfigSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualDiskConfigSpec", propOrder = {"diskMoveType", "migrateCache"})
public class VirtualDiskConfigSpec extends VirtualDeviceConfigSpec {
  protected String diskMoveType;
  
  protected Boolean migrateCache;
  
  public String getDiskMoveType() {
    return this.diskMoveType;
  }
  
  public void setDiskMoveType(String paramString) {
    this.diskMoveType = paramString;
  }
  
  public Boolean isMigrateCache() {
    return this.migrateCache;
  }
  
  public void setMigrateCache(Boolean paramBoolean) {
    this.migrateCache = paramBoolean;
  }
}
