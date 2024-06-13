package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.PhysicalNicHint;
import com.vmware.vim25.PhysicalNicIpHint;
import com.vmware.vim25.PhysicalNicNameHint;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhysicalNicHint", propOrder = {"vlanId"})
@XmlSeeAlso({PhysicalNicIpHint.class, PhysicalNicNameHint.class})
public class PhysicalNicHint extends DynamicData {
  protected Integer vlanId;
  
  public Integer getVlanId() {
    return this.vlanId;
  }
  
  public void setVlanId(Integer paramInteger) {
    this.vlanId = paramInteger;
  }
}
