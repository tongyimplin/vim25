package com.vmware.vim25;

import com.vmware.vim25.KeyValue;
import com.vmware.vim25.OvfConsumerCallbackFault;
import com.vmware.vim25.OvfConsumerFault;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OvfConsumerFault", propOrder = {"errorKey", "message", "params"})
public class OvfConsumerFault extends OvfConsumerCallbackFault {
  @XmlElement(required = true)
  protected String errorKey;
  
  @XmlElement(required = true)
  protected String message;
  
  protected List<KeyValue> params;
  
  public String getErrorKey() {
    return this.errorKey;
  }
  
  public void setErrorKey(String paramString) {
    this.errorKey = paramString;
  }
  
  public String getMessage() {
    return this.message;
  }
  
  public void setMessage(String paramString) {
    this.message = paramString;
  }
  
  public List<KeyValue> getParams() {
    if (this.params == null)
      this.params = new ArrayList<>(); 
    return this.params;
  }
}
