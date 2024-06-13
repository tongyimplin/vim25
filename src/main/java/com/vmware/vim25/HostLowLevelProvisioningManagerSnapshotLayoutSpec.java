package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostLowLevelProvisioningManagerDiskLayoutSpec;
import com.vmware.vim25.HostLowLevelProvisioningManagerSnapshotLayoutSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostLowLevelProvisioningManagerSnapshotLayoutSpec", propOrder = {"id", "srcFilename", "dstFilename", "disk"})
public class HostLowLevelProvisioningManagerSnapshotLayoutSpec extends DynamicData {
  protected int id;
  
  @XmlElement(required = true)
  protected String srcFilename;
  
  @XmlElement(required = true)
  protected String dstFilename;
  
  protected List<HostLowLevelProvisioningManagerDiskLayoutSpec> disk;
  
  public int getId() {
    return this.id;
  }
  
  public void setId(int paramInt) {
    this.id = paramInt;
  }
  
  public String getSrcFilename() {
    return this.srcFilename;
  }
  
  public void setSrcFilename(String paramString) {
    this.srcFilename = paramString;
  }
  
  public String getDstFilename() {
    return this.dstFilename;
  }
  
  public void setDstFilename(String paramString) {
    this.dstFilename = paramString;
  }
  
  public List<HostLowLevelProvisioningManagerDiskLayoutSpec> getDisk() {
    if (this.disk == null)
      this.disk = new ArrayList<>(); 
    return this.disk;
  }
}
