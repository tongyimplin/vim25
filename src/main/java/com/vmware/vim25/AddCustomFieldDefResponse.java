package com.vmware.vim25;

import com.vmware.vim25.AddCustomFieldDefResponse;
import com.vmware.vim25.CustomFieldDef;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "AddCustomFieldDefResponse")
public class AddCustomFieldDefResponse {
  @XmlElement(required = true)
  protected CustomFieldDef returnval;
  
  public CustomFieldDef getReturnval() {
    return this.returnval;
  }
  
  public void setReturnval(CustomFieldDef paramCustomFieldDef) {
    this.returnval = paramCustomFieldDef;
  }
}
