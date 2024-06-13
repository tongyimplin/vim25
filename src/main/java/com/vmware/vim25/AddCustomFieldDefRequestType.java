package com.vmware.vim25;

import com.vmware.vim25.AddCustomFieldDefRequestType;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.PrivilegePolicyDef;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddCustomFieldDefRequestType", propOrder = {"_this", "name", "moType", "fieldDefPolicy", "fieldPolicy"})
public class AddCustomFieldDefRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected String name;
  
  protected String moType;
  
  protected PrivilegePolicyDef fieldDefPolicy;
  
  protected PrivilegePolicyDef fieldPolicy;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public String getMoType() {
    return this.moType;
  }
  
  public void setMoType(String paramString) {
    this.moType = paramString;
  }
  
  public PrivilegePolicyDef getFieldDefPolicy() {
    return this.fieldDefPolicy;
  }
  
  public void setFieldDefPolicy(PrivilegePolicyDef paramPrivilegePolicyDef) {
    this.fieldDefPolicy = paramPrivilegePolicyDef;
  }
  
  public PrivilegePolicyDef getFieldPolicy() {
    return this.fieldPolicy;
  }
  
  public void setFieldPolicy(PrivilegePolicyDef paramPrivilegePolicyDef) {
    this.fieldPolicy = paramPrivilegePolicyDef;
  }
}
