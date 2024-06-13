package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.DynamicProperty;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.MissingProperty;
import com.vmware.vim25.ObjectContent;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjectContent", propOrder = {"obj", "propSet", "missingSet"})
public class ObjectContent extends DynamicData {
  @XmlElement(required = true)
  protected ManagedObjectReference obj;
  
  protected List<DynamicProperty> propSet;
  
  protected List<MissingProperty> missingSet;
  
  public ManagedObjectReference getObj() {
    return this.obj;
  }
  
  public void setObj(ManagedObjectReference paramManagedObjectReference) {
    this.obj = paramManagedObjectReference;
  }
  
  public List<DynamicProperty> getPropSet() {
    if (this.propSet == null)
      this.propSet = new ArrayList<>(); 
    return this.propSet;
  }
  
  public List<MissingProperty> getMissingSet() {
    if (this.missingSet == null)
      this.missingSet = new ArrayList<>(); 
    return this.missingSet;
  }
}
