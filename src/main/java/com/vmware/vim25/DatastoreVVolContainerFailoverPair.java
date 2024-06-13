package com.vmware.vim25;

import com.vmware.vim25.DatastoreVVolContainerFailoverPair;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.KeyValue;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatastoreVVolContainerFailoverPair", propOrder = {"srcContainer", "tgtContainer", "vvolMapping"})
public class DatastoreVVolContainerFailoverPair extends DynamicData {
  protected String srcContainer;
  
  @XmlElement(required = true)
  protected String tgtContainer;
  
  protected List<KeyValue> vvolMapping;
  
  public String getSrcContainer() {
    return this.srcContainer;
  }
  
  public void setSrcContainer(String paramString) {
    this.srcContainer = paramString;
  }
  
  public String getTgtContainer() {
    return this.tgtContainer;
  }
  
  public void setTgtContainer(String paramString) {
    this.tgtContainer = paramString;
  }
  
  public List<KeyValue> getVvolMapping() {
    if (this.vvolMapping == null)
      this.vvolMapping = new ArrayList<>(); 
    return this.vvolMapping;
  }
}
