package com.vmware.vim25;

import com.vmware.vim25.AnswerFile;
import com.vmware.vim25.HostProfilesEntityCustomizations;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.StructuredCustomizations;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StructuredCustomizations", propOrder = {"entity", "customizations"})
public class StructuredCustomizations extends HostProfilesEntityCustomizations {
  @XmlElement(required = true)
  protected ManagedObjectReference entity;
  
  protected AnswerFile customizations;
  
  public ManagedObjectReference getEntity() {
    return this.entity;
  }
  
  public void setEntity(ManagedObjectReference paramManagedObjectReference) {
    this.entity = paramManagedObjectReference;
  }
  
  public AnswerFile getCustomizations() {
    return this.customizations;
  }
  
  public void setCustomizations(AnswerFile paramAnswerFile) {
    this.customizations = paramAnswerFile;
  }
}
