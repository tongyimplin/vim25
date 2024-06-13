package com.vmware.vim25;

import com.vmware.vim25.KeyValue;
import com.vmware.vim25.VslmCloneSpec;
import com.vmware.vim25.VslmMigrateSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VslmCloneSpec", propOrder = {"name", "keepAfterDeleteVm", "metadata"})
public class VslmCloneSpec extends VslmMigrateSpec {
  @XmlElement(required = true)
  protected String name;
  
  protected Boolean keepAfterDeleteVm;
  
  protected List<KeyValue> metadata;
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public Boolean isKeepAfterDeleteVm() {
    return this.keepAfterDeleteVm;
  }
  
  public void setKeepAfterDeleteVm(Boolean paramBoolean) {
    this.keepAfterDeleteVm = paramBoolean;
  }
  
  public List<KeyValue> getMetadata() {
    if (this.metadata == null)
      this.metadata = new ArrayList<>(); 
    return this.metadata;
  }
}
