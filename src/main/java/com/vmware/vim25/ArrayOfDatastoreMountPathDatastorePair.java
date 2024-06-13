package com.vmware.vim25;

import com.vmware.vim25.ArrayOfDatastoreMountPathDatastorePair;
import com.vmware.vim25.DatastoreMountPathDatastorePair;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDatastoreMountPathDatastorePair", propOrder = {"datastoreMountPathDatastorePair"})
public class ArrayOfDatastoreMountPathDatastorePair {
  @XmlElement(name = "DatastoreMountPathDatastorePair")
  protected List<DatastoreMountPathDatastorePair> datastoreMountPathDatastorePair;
  
  public List<DatastoreMountPathDatastorePair> getDatastoreMountPathDatastorePair() {
    if (this.datastoreMountPathDatastorePair == null)
      this.datastoreMountPathDatastorePair = new ArrayList<>(); 
    return this.datastoreMountPathDatastorePair;
  }
}
