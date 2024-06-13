package com.vmware.vim25;

import com.vmware.vim25.ArrayOfDatastoreVVolContainerFailoverPair;
import com.vmware.vim25.DatastoreVVolContainerFailoverPair;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDatastoreVVolContainerFailoverPair", propOrder = {"datastoreVVolContainerFailoverPair"})
public class ArrayOfDatastoreVVolContainerFailoverPair {
  @XmlElement(name = "DatastoreVVolContainerFailoverPair")
  protected List<DatastoreVVolContainerFailoverPair> datastoreVVolContainerFailoverPair;
  
  public List<DatastoreVVolContainerFailoverPair> getDatastoreVVolContainerFailoverPair() {
    if (this.datastoreVVolContainerFailoverPair == null)
      this.datastoreVVolContainerFailoverPair = new ArrayList<>(); 
    return this.datastoreVVolContainerFailoverPair;
  }
}
