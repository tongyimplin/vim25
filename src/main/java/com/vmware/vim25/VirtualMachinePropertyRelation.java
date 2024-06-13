package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.DynamicProperty;
import com.vmware.vim25.VirtualMachinePropertyRelation;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachinePropertyRelation", propOrder = {"key", "relations"})
public class VirtualMachinePropertyRelation extends DynamicData {
  @XmlElement(required = true)
  protected DynamicProperty key;
  
  protected List<DynamicProperty> relations;
  
  public DynamicProperty getKey() {
    return this.key;
  }
  
  public void setKey(DynamicProperty paramDynamicProperty) {
    this.key = paramDynamicProperty;
  }
  
  public List<DynamicProperty> getRelations() {
    if (this.relations == null)
      this.relations = new ArrayList<>(); 
    return this.relations;
  }
}
