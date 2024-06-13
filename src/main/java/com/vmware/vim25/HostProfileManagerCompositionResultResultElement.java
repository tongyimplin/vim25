package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostProfileManagerCompositionResultResultElement;
import com.vmware.vim25.LocalizableMessage;
import com.vmware.vim25.ManagedObjectReference;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostProfileManagerCompositionResultResultElement", propOrder = {"target", "status", "errors"})
public class HostProfileManagerCompositionResultResultElement extends DynamicData {
  @XmlElement(required = true)
  protected ManagedObjectReference target;
  
  @XmlElement(required = true)
  protected String status;
  
  protected List<LocalizableMessage> errors;
  
  public ManagedObjectReference getTarget() {
    return this.target;
  }
  
  public void setTarget(ManagedObjectReference paramManagedObjectReference) {
    this.target = paramManagedObjectReference;
  }
  
  public String getStatus() {
    return this.status;
  }
  
  public void setStatus(String paramString) {
    this.status = paramString;
  }
  
  public List<LocalizableMessage> getErrors() {
    if (this.errors == null)
      this.errors = new ArrayList<>(); 
    return this.errors;
  }
}
