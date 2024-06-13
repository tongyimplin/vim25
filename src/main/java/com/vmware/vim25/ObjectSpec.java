package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.ObjectSpec;
import com.vmware.vim25.SelectionSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjectSpec", propOrder = {"obj", "skip", "selectSet"})
public class ObjectSpec extends DynamicData {
  @XmlElement(required = true)
  protected ManagedObjectReference obj;
  
  protected Boolean skip;
  
  protected List<SelectionSpec> selectSet;
  
  public ManagedObjectReference getObj() {
    return this.obj;
  }
  
  public void setObj(ManagedObjectReference paramManagedObjectReference) {
    this.obj = paramManagedObjectReference;
  }
  
  public Boolean isSkip() {
    return this.skip;
  }
  
  public void setSkip(Boolean paramBoolean) {
    this.skip = paramBoolean;
  }
  
  public List<SelectionSpec> getSelectSet() {
    if (this.selectSet == null)
      this.selectSet = new ArrayList<>(); 
    return this.selectSet;
  }
}
