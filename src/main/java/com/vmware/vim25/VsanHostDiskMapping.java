package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostScsiDisk;
import com.vmware.vim25.VsanHostDiskMapping;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VsanHostDiskMapping", propOrder = {"ssd", "nonSsd"})
public class VsanHostDiskMapping extends DynamicData {
  @XmlElement(required = true)
  protected HostScsiDisk ssd;
  
  @XmlElement(required = true)
  protected List<HostScsiDisk> nonSsd;
  
  public HostScsiDisk getSsd() {
    return this.ssd;
  }
  
  public void setSsd(HostScsiDisk paramHostScsiDisk) {
    this.ssd = paramHostScsiDisk;
  }
  
  public List<HostScsiDisk> getNonSsd() {
    if (this.nonSsd == null)
      this.nonSsd = new ArrayList<>(); 
    return this.nonSsd;
  }
}
