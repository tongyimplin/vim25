package com.vmware.vim25;

import com.vmware.vim25.DVSNameArrayUplinkPortPolicy;
import com.vmware.vim25.DVSUplinkPortPolicy;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DVSNameArrayUplinkPortPolicy", propOrder = {"uplinkPortName"})
public class DVSNameArrayUplinkPortPolicy extends DVSUplinkPortPolicy {
  @XmlElement(required = true)
  protected List<String> uplinkPortName;
  
  public List<String> getUplinkPortName() {
    if (this.uplinkPortName == null)
      this.uplinkPortName = new ArrayList<>(); 
    return this.uplinkPortName;
  }
}
