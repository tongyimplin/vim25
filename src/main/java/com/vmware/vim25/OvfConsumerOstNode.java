package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.OvfConsumerOstNode;
import com.vmware.vim25.OvfConsumerOvfSection;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OvfConsumerOstNode", propOrder = {"id", "type", "section", "child", "entity"})
public class OvfConsumerOstNode extends DynamicData {
  @XmlElement(required = true)
  protected String id;
  
  @XmlElement(required = true)
  protected String type;
  
  protected List<OvfConsumerOvfSection> section;
  
  protected List<OvfConsumerOstNode> child;
  
  protected ManagedObjectReference entity;
  
  public String getId() {
    return this.id;
  }
  
  public void setId(String paramString) {
    this.id = paramString;
  }
  
  public String getType() {
    return this.type;
  }
  
  public void setType(String paramString) {
    this.type = paramString;
  }
  
  public List<OvfConsumerOvfSection> getSection() {
    if (this.section == null)
      this.section = new ArrayList<>(); 
    return this.section;
  }
  
  public List<OvfConsumerOstNode> getChild() {
    if (this.child == null)
      this.child = new ArrayList<>(); 
    return this.child;
  }
  
  public ManagedObjectReference getEntity() {
    return this.entity;
  }
  
  public void setEntity(ManagedObjectReference paramManagedObjectReference) {
    this.entity = paramManagedObjectReference;
  }
}
