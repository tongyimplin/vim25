package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.MissingObject;
import com.vmware.vim25.ObjectUpdate;
import com.vmware.vim25.PropertyFilterUpdate;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PropertyFilterUpdate", propOrder = {"filter", "objectSet", "missingSet"})
public class PropertyFilterUpdate extends DynamicData {
  @XmlElement(required = true)
  protected ManagedObjectReference filter;
  
  protected List<ObjectUpdate> objectSet;
  
  protected List<MissingObject> missingSet;
  
  public ManagedObjectReference getFilter() {
    return this.filter;
  }
  
  public void setFilter(ManagedObjectReference paramManagedObjectReference) {
    this.filter = paramManagedObjectReference;
  }
  
  public List<ObjectUpdate> getObjectSet() {
    if (this.objectSet == null)
      this.objectSet = new ArrayList<>(); 
    return this.objectSet;
  }
  
  public List<MissingObject> getMissingSet() {
    if (this.missingSet == null)
      this.missingSet = new ArrayList<>(); 
    return this.missingSet;
  }
}
