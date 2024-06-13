package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.KeyAnyValue;
import com.vmware.vim25.LocalizableMessage;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocalizableMessage", propOrder = {"key", "arg", "message"})
public class LocalizableMessage extends DynamicData {
  @XmlElement(required = true)
  protected String key;
  
  protected List<KeyAnyValue> arg;
  
  protected String message;
  
  public String getKey() {
    return this.key;
  }
  
  public void setKey(String paramString) {
    this.key = paramString;
  }
  
  public List<KeyAnyValue> getArg() {
    if (this.arg == null)
      this.arg = new ArrayList<>(); 
    return this.arg;
  }
  
  public String getMessage() {
    return this.message;
  }
  
  public void setMessage(String paramString) {
    this.message = paramString;
  }
}
