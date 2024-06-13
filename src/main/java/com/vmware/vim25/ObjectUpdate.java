package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.MissingProperty;
import com.vmware.vim25.ObjectUpdate;
import com.vmware.vim25.ObjectUpdateKind;
import com.vmware.vim25.PropertyChange;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjectUpdate", propOrder = {"kind", "obj", "changeSet", "missingSet"})
public class ObjectUpdate extends DynamicData {
  @XmlElement(required = true)
  protected ObjectUpdateKind kind;
  
  @XmlElement(required = true)
  protected ManagedObjectReference obj;
  
  protected List<PropertyChange> changeSet;
  
  protected List<MissingProperty> missingSet;
  
  public ObjectUpdateKind getKind() {
    return this.kind;
  }
  
  public void setKind(ObjectUpdateKind paramObjectUpdateKind) {
    this.kind = paramObjectUpdateKind;
  }
  
  public ManagedObjectReference getObj() {
    return this.obj;
  }
  
  public void setObj(ManagedObjectReference paramManagedObjectReference) {
    this.obj = paramManagedObjectReference;
  }
  
  public List<PropertyChange> getChangeSet() {
    if (this.changeSet == null)
      this.changeSet = new ArrayList<>(); 
    return this.changeSet;
  }
  
  public List<MissingProperty> getMissingSet() {
    if (this.missingSet == null)
      this.missingSet = new ArrayList<>(); 
    return this.missingSet;
  }
}
