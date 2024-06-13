package com.vmware.vim25;

import com.vmware.vim25.ArrayOfDatastoreHostMount;
import com.vmware.vim25.DatastoreHostMount;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDatastoreHostMount", propOrder = {"datastoreHostMount"})
public class ArrayOfDatastoreHostMount {
  @XmlElement(name = "DatastoreHostMount")
  protected List<DatastoreHostMount> datastoreHostMount;
  
  public List<DatastoreHostMount> getDatastoreHostMount() {
    if (this.datastoreHostMount == null)
      this.datastoreHostMount = new ArrayList<>(); 
    return this.datastoreHostMount;
  }
}
