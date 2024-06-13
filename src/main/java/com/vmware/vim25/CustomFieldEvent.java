package com.vmware.vim25;

import com.vmware.vim25.CustomFieldDefEvent;
import com.vmware.vim25.CustomFieldValueChangedEvent;
import com.vmware.vim25.Event;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomFieldEvent")
@XmlSeeAlso({CustomFieldValueChangedEvent.class, CustomFieldDefEvent.class})
public class CustomFieldEvent extends Event {}
