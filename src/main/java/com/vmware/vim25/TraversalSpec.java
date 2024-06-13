package com.vmware.vim25;

import com.vmware.vim25.SelectionSpec;
import com.vmware.vim25.TraversalSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TraversalSpec", propOrder = {"type", "path", "skip", "selectSet"})
public class TraversalSpec extends SelectionSpec {
  @XmlElement(required = true)
  protected String type;
  
  @XmlElement(required = true)
  protected String path;
  
  protected Boolean skip;
  
  protected List<SelectionSpec> selectSet;
  
  public String getType() {
    return this.type;
  }
  
  public void setType(String paramString) {
    this.type = paramString;
  }
  
  public String getPath() {
    return this.path;
  }
  
  public void setPath(String paramString) {
    this.path = paramString;
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
