package com.vmware.vim25;

import com.vmware.vim25.OvfAttribute;
import com.vmware.vim25.OvfInvalidValue;
import com.vmware.vim25.OvfInvalidValueConfiguration;
import com.vmware.vim25.OvfInvalidValueEmpty;
import com.vmware.vim25.OvfInvalidValueFormatMalformed;
import com.vmware.vim25.OvfInvalidValueReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OvfInvalidValue", propOrder = {"value"})
@XmlSeeAlso({OvfInvalidValueFormatMalformed.class, OvfInvalidValueEmpty.class, OvfInvalidValueReference.class, OvfInvalidValueConfiguration.class})
public class OvfInvalidValue extends OvfAttribute {
  @XmlElement(required = true)
  protected String value;
  
  public String getValue() {
    return this.value;
  }
  
  public void setValue(String paramString) {
    this.value = paramString;
  }
}
