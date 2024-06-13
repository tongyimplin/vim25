package com.vmware.vim25;

import com.vmware.vim25.CustomFieldDef;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.PrivilegePolicyDef;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomFieldDef", propOrder = {"key", "name", "type", "managedObjectType", "fieldDefPrivileges", "fieldInstancePrivileges"})
public class CustomFieldDef extends DynamicData {
  protected int key;
  
  @XmlElement(required = true)
  protected String name;
  
  @XmlElement(required = true)
  protected String type;
  
  protected String managedObjectType;
  
  protected PrivilegePolicyDef fieldDefPrivileges;
  
  protected PrivilegePolicyDef fieldInstancePrivileges;
  
  public int getKey() {
    return this.key;
  }
  
  public void setKey(int paramInt) {
    this.key = paramInt;
  }
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public String getType() {
    return this.type;
  }
  
  public void setType(String paramString) {
    this.type = paramString;
  }
  
  public String getManagedObjectType() {
    return this.managedObjectType;
  }
  
  public void setManagedObjectType(String paramString) {
    this.managedObjectType = paramString;
  }
  
  public PrivilegePolicyDef getFieldDefPrivileges() {
    return this.fieldDefPrivileges;
  }
  
  public void setFieldDefPrivileges(PrivilegePolicyDef paramPrivilegePolicyDef) {
    this.fieldDefPrivileges = paramPrivilegePolicyDef;
  }
  
  public PrivilegePolicyDef getFieldInstancePrivileges() {
    return this.fieldInstancePrivileges;
  }
  
  public void setFieldInstancePrivileges(PrivilegePolicyDef paramPrivilegePolicyDef) {
    this.fieldInstancePrivileges = paramPrivilegePolicyDef;
  }
}
