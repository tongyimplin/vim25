package com.vmware.vim25;

import com.vmware.vim25.DVPortgroupSelection;
import com.vmware.vim25.DVSSelection;
import com.vmware.vim25.DynamicData;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectionSet")
@XmlSeeAlso({DVPortgroupSelection.class, DVSSelection.class})
public class SelectionSet extends DynamicData {}
