package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostScsiTopologyLun;
import com.vmware.vim25.HostScsiTopologyTarget;
import com.vmware.vim25.HostTargetTransport;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostScsiTopologyTarget", propOrder = {"key", "target", "lun", "transport"})
public class HostScsiTopologyTarget extends DynamicData {
  @XmlElement(required = true)
  protected String key;
  
  protected int target;
  
  protected List<HostScsiTopologyLun> lun;
  
  protected HostTargetTransport transport;
  
  public String getKey() {
    return this.key;
  }
  
  public void setKey(String paramString) {
    this.key = paramString;
  }
  
  public int getTarget() {
    return this.target;
  }
  
  public void setTarget(int paramInt) {
    this.target = paramInt;
  }
  
  public List<HostScsiTopologyLun> getLun() {
    if (this.lun == null)
      this.lun = new ArrayList<>(); 
    return this.lun;
  }
  
  public HostTargetTransport getTransport() {
    return this.transport;
  }
  
  public void setTransport(HostTargetTransport paramHostTargetTransport) {
    this.transport = paramHostTargetTransport;
  }
}
