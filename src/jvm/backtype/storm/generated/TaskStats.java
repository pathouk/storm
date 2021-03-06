/**
 * Autogenerated by Thrift Compiler (0.7.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package backtype.storm.generated;

import org.apache.commons.lang.builder.HashCodeBuilder;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TaskStats implements org.apache.thrift7.TBase<TaskStats, TaskStats._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift7.protocol.TStruct STRUCT_DESC = new org.apache.thrift7.protocol.TStruct("TaskStats");

  private static final org.apache.thrift7.protocol.TField EMITTED_FIELD_DESC = new org.apache.thrift7.protocol.TField("emitted", org.apache.thrift7.protocol.TType.MAP, (short)1);
  private static final org.apache.thrift7.protocol.TField TRANSFERRED_FIELD_DESC = new org.apache.thrift7.protocol.TField("transferred", org.apache.thrift7.protocol.TType.MAP, (short)2);
  private static final org.apache.thrift7.protocol.TField SPECIFIC_FIELD_DESC = new org.apache.thrift7.protocol.TField("specific", org.apache.thrift7.protocol.TType.STRUCT, (short)3);

  private Map<String,Map<Integer,Long>> emitted; // required
  private Map<String,Map<Integer,Long>> transferred; // required
  private TaskSpecificStats specific; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift7.TFieldIdEnum {
    EMITTED((short)1, "emitted"),
    TRANSFERRED((short)2, "transferred"),
    SPECIFIC((short)3, "specific");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // EMITTED
          return EMITTED;
        case 2: // TRANSFERRED
          return TRANSFERRED;
        case 3: // SPECIFIC
          return SPECIFIC;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments

  public static final Map<_Fields, org.apache.thrift7.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift7.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift7.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.EMITTED, new org.apache.thrift7.meta_data.FieldMetaData("emitted", org.apache.thrift7.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift7.meta_data.MapMetaData(org.apache.thrift7.protocol.TType.MAP, 
            new org.apache.thrift7.meta_data.FieldValueMetaData(org.apache.thrift7.protocol.TType.STRING), 
            new org.apache.thrift7.meta_data.MapMetaData(org.apache.thrift7.protocol.TType.MAP, 
                new org.apache.thrift7.meta_data.FieldValueMetaData(org.apache.thrift7.protocol.TType.I32), 
                new org.apache.thrift7.meta_data.FieldValueMetaData(org.apache.thrift7.protocol.TType.I64)))));
    tmpMap.put(_Fields.TRANSFERRED, new org.apache.thrift7.meta_data.FieldMetaData("transferred", org.apache.thrift7.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift7.meta_data.MapMetaData(org.apache.thrift7.protocol.TType.MAP, 
            new org.apache.thrift7.meta_data.FieldValueMetaData(org.apache.thrift7.protocol.TType.STRING), 
            new org.apache.thrift7.meta_data.MapMetaData(org.apache.thrift7.protocol.TType.MAP, 
                new org.apache.thrift7.meta_data.FieldValueMetaData(org.apache.thrift7.protocol.TType.I32), 
                new org.apache.thrift7.meta_data.FieldValueMetaData(org.apache.thrift7.protocol.TType.I64)))));
    tmpMap.put(_Fields.SPECIFIC, new org.apache.thrift7.meta_data.FieldMetaData("specific", org.apache.thrift7.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift7.meta_data.StructMetaData(org.apache.thrift7.protocol.TType.STRUCT, TaskSpecificStats.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift7.meta_data.FieldMetaData.addStructMetaDataMap(TaskStats.class, metaDataMap);
  }

  public TaskStats() {
  }

  public TaskStats(
    Map<String,Map<Integer,Long>> emitted,
    Map<String,Map<Integer,Long>> transferred,
    TaskSpecificStats specific)
  {
    this();
    this.emitted = emitted;
    this.transferred = transferred;
    this.specific = specific;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TaskStats(TaskStats other) {
    if (other.is_set_emitted()) {
      Map<String,Map<Integer,Long>> __this__emitted = new HashMap<String,Map<Integer,Long>>();
      for (Map.Entry<String, Map<Integer,Long>> other_element : other.emitted.entrySet()) {

        String other_element_key = other_element.getKey();
        Map<Integer,Long> other_element_value = other_element.getValue();

        String __this__emitted_copy_key = other_element_key;

        Map<Integer,Long> __this__emitted_copy_value = new HashMap<Integer,Long>();
        for (Map.Entry<Integer, Long> other_element_value_element : other_element_value.entrySet()) {

          Integer other_element_value_element_key = other_element_value_element.getKey();
          Long other_element_value_element_value = other_element_value_element.getValue();

          Integer __this__emitted_copy_value_copy_key = other_element_value_element_key;

          Long __this__emitted_copy_value_copy_value = other_element_value_element_value;

          __this__emitted_copy_value.put(__this__emitted_copy_value_copy_key, __this__emitted_copy_value_copy_value);
        }

        __this__emitted.put(__this__emitted_copy_key, __this__emitted_copy_value);
      }
      this.emitted = __this__emitted;
    }
    if (other.is_set_transferred()) {
      Map<String,Map<Integer,Long>> __this__transferred = new HashMap<String,Map<Integer,Long>>();
      for (Map.Entry<String, Map<Integer,Long>> other_element : other.transferred.entrySet()) {

        String other_element_key = other_element.getKey();
        Map<Integer,Long> other_element_value = other_element.getValue();

        String __this__transferred_copy_key = other_element_key;

        Map<Integer,Long> __this__transferred_copy_value = new HashMap<Integer,Long>();
        for (Map.Entry<Integer, Long> other_element_value_element : other_element_value.entrySet()) {

          Integer other_element_value_element_key = other_element_value_element.getKey();
          Long other_element_value_element_value = other_element_value_element.getValue();

          Integer __this__transferred_copy_value_copy_key = other_element_value_element_key;

          Long __this__transferred_copy_value_copy_value = other_element_value_element_value;

          __this__transferred_copy_value.put(__this__transferred_copy_value_copy_key, __this__transferred_copy_value_copy_value);
        }

        __this__transferred.put(__this__transferred_copy_key, __this__transferred_copy_value);
      }
      this.transferred = __this__transferred;
    }
    if (other.is_set_specific()) {
      this.specific = new TaskSpecificStats(other.specific);
    }
  }

  public TaskStats deepCopy() {
    return new TaskStats(this);
  }

  @Override
  public void clear() {
    this.emitted = null;
    this.transferred = null;
    this.specific = null;
  }

  public int get_emitted_size() {
    return (this.emitted == null) ? 0 : this.emitted.size();
  }

  public void put_to_emitted(String key, Map<Integer,Long> val) {
    if (this.emitted == null) {
      this.emitted = new HashMap<String,Map<Integer,Long>>();
    }
    this.emitted.put(key, val);
  }

  public Map<String,Map<Integer,Long>> get_emitted() {
    return this.emitted;
  }

  public void set_emitted(Map<String,Map<Integer,Long>> emitted) {
    this.emitted = emitted;
  }

  public void unset_emitted() {
    this.emitted = null;
  }

  /** Returns true if field emitted is set (has been assigned a value) and false otherwise */
  public boolean is_set_emitted() {
    return this.emitted != null;
  }

  public void set_emitted_isSet(boolean value) {
    if (!value) {
      this.emitted = null;
    }
  }

  public int get_transferred_size() {
    return (this.transferred == null) ? 0 : this.transferred.size();
  }

  public void put_to_transferred(String key, Map<Integer,Long> val) {
    if (this.transferred == null) {
      this.transferred = new HashMap<String,Map<Integer,Long>>();
    }
    this.transferred.put(key, val);
  }

  public Map<String,Map<Integer,Long>> get_transferred() {
    return this.transferred;
  }

  public void set_transferred(Map<String,Map<Integer,Long>> transferred) {
    this.transferred = transferred;
  }

  public void unset_transferred() {
    this.transferred = null;
  }

  /** Returns true if field transferred is set (has been assigned a value) and false otherwise */
  public boolean is_set_transferred() {
    return this.transferred != null;
  }

  public void set_transferred_isSet(boolean value) {
    if (!value) {
      this.transferred = null;
    }
  }

  public TaskSpecificStats get_specific() {
    return this.specific;
  }

  public void set_specific(TaskSpecificStats specific) {
    this.specific = specific;
  }

  public void unset_specific() {
    this.specific = null;
  }

  /** Returns true if field specific is set (has been assigned a value) and false otherwise */
  public boolean is_set_specific() {
    return this.specific != null;
  }

  public void set_specific_isSet(boolean value) {
    if (!value) {
      this.specific = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case EMITTED:
      if (value == null) {
        unset_emitted();
      } else {
        set_emitted((Map<String,Map<Integer,Long>>)value);
      }
      break;

    case TRANSFERRED:
      if (value == null) {
        unset_transferred();
      } else {
        set_transferred((Map<String,Map<Integer,Long>>)value);
      }
      break;

    case SPECIFIC:
      if (value == null) {
        unset_specific();
      } else {
        set_specific((TaskSpecificStats)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case EMITTED:
      return get_emitted();

    case TRANSFERRED:
      return get_transferred();

    case SPECIFIC:
      return get_specific();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case EMITTED:
      return is_set_emitted();
    case TRANSFERRED:
      return is_set_transferred();
    case SPECIFIC:
      return is_set_specific();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TaskStats)
      return this.equals((TaskStats)that);
    return false;
  }

  public boolean equals(TaskStats that) {
    if (that == null)
      return false;

    boolean this_present_emitted = true && this.is_set_emitted();
    boolean that_present_emitted = true && that.is_set_emitted();
    if (this_present_emitted || that_present_emitted) {
      if (!(this_present_emitted && that_present_emitted))
        return false;
      if (!this.emitted.equals(that.emitted))
        return false;
    }

    boolean this_present_transferred = true && this.is_set_transferred();
    boolean that_present_transferred = true && that.is_set_transferred();
    if (this_present_transferred || that_present_transferred) {
      if (!(this_present_transferred && that_present_transferred))
        return false;
      if (!this.transferred.equals(that.transferred))
        return false;
    }

    boolean this_present_specific = true && this.is_set_specific();
    boolean that_present_specific = true && that.is_set_specific();
    if (this_present_specific || that_present_specific) {
      if (!(this_present_specific && that_present_specific))
        return false;
      if (!this.specific.equals(that.specific))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_emitted = true && (is_set_emitted());
    builder.append(present_emitted);
    if (present_emitted)
      builder.append(emitted);

    boolean present_transferred = true && (is_set_transferred());
    builder.append(present_transferred);
    if (present_transferred)
      builder.append(transferred);

    boolean present_specific = true && (is_set_specific());
    builder.append(present_specific);
    if (present_specific)
      builder.append(specific);

    return builder.toHashCode();
  }

  public int compareTo(TaskStats other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TaskStats typedOther = (TaskStats)other;

    lastComparison = Boolean.valueOf(is_set_emitted()).compareTo(typedOther.is_set_emitted());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_emitted()) {
      lastComparison = org.apache.thrift7.TBaseHelper.compareTo(this.emitted, typedOther.emitted);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_transferred()).compareTo(typedOther.is_set_transferred());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_transferred()) {
      lastComparison = org.apache.thrift7.TBaseHelper.compareTo(this.transferred, typedOther.transferred);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_specific()).compareTo(typedOther.is_set_specific());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_specific()) {
      lastComparison = org.apache.thrift7.TBaseHelper.compareTo(this.specific, typedOther.specific);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift7.protocol.TProtocol iprot) throws org.apache.thrift7.TException {
    org.apache.thrift7.protocol.TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == org.apache.thrift7.protocol.TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // EMITTED
          if (field.type == org.apache.thrift7.protocol.TType.MAP) {
            {
              org.apache.thrift7.protocol.TMap _map105 = iprot.readMapBegin();
              this.emitted = new HashMap<String,Map<Integer,Long>>(2*_map105.size);
              for (int _i106 = 0; _i106 < _map105.size; ++_i106)
              {
                String _key107; // required
                Map<Integer,Long> _val108; // required
                _key107 = iprot.readString();
                {
                  org.apache.thrift7.protocol.TMap _map109 = iprot.readMapBegin();
                  _val108 = new HashMap<Integer,Long>(2*_map109.size);
                  for (int _i110 = 0; _i110 < _map109.size; ++_i110)
                  {
                    int _key111; // required
                    long _val112; // required
                    _key111 = iprot.readI32();
                    _val112 = iprot.readI64();
                    _val108.put(_key111, _val112);
                  }
                  iprot.readMapEnd();
                }
                this.emitted.put(_key107, _val108);
              }
              iprot.readMapEnd();
            }
          } else { 
            org.apache.thrift7.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // TRANSFERRED
          if (field.type == org.apache.thrift7.protocol.TType.MAP) {
            {
              org.apache.thrift7.protocol.TMap _map113 = iprot.readMapBegin();
              this.transferred = new HashMap<String,Map<Integer,Long>>(2*_map113.size);
              for (int _i114 = 0; _i114 < _map113.size; ++_i114)
              {
                String _key115; // required
                Map<Integer,Long> _val116; // required
                _key115 = iprot.readString();
                {
                  org.apache.thrift7.protocol.TMap _map117 = iprot.readMapBegin();
                  _val116 = new HashMap<Integer,Long>(2*_map117.size);
                  for (int _i118 = 0; _i118 < _map117.size; ++_i118)
                  {
                    int _key119; // required
                    long _val120; // required
                    _key119 = iprot.readI32();
                    _val120 = iprot.readI64();
                    _val116.put(_key119, _val120);
                  }
                  iprot.readMapEnd();
                }
                this.transferred.put(_key115, _val116);
              }
              iprot.readMapEnd();
            }
          } else { 
            org.apache.thrift7.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // SPECIFIC
          if (field.type == org.apache.thrift7.protocol.TType.STRUCT) {
            this.specific = new TaskSpecificStats();
            this.specific.read(iprot);
          } else { 
            org.apache.thrift7.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          org.apache.thrift7.protocol.TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();
    validate();
  }

  public void write(org.apache.thrift7.protocol.TProtocol oprot) throws org.apache.thrift7.TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.emitted != null) {
      oprot.writeFieldBegin(EMITTED_FIELD_DESC);
      {
        oprot.writeMapBegin(new org.apache.thrift7.protocol.TMap(org.apache.thrift7.protocol.TType.STRING, org.apache.thrift7.protocol.TType.MAP, this.emitted.size()));
        for (Map.Entry<String, Map<Integer,Long>> _iter121 : this.emitted.entrySet())
        {
          oprot.writeString(_iter121.getKey());
          {
            oprot.writeMapBegin(new org.apache.thrift7.protocol.TMap(org.apache.thrift7.protocol.TType.I32, org.apache.thrift7.protocol.TType.I64, _iter121.getValue().size()));
            for (Map.Entry<Integer, Long> _iter122 : _iter121.getValue().entrySet())
            {
              oprot.writeI32(_iter122.getKey());
              oprot.writeI64(_iter122.getValue());
            }
            oprot.writeMapEnd();
          }
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.transferred != null) {
      oprot.writeFieldBegin(TRANSFERRED_FIELD_DESC);
      {
        oprot.writeMapBegin(new org.apache.thrift7.protocol.TMap(org.apache.thrift7.protocol.TType.STRING, org.apache.thrift7.protocol.TType.MAP, this.transferred.size()));
        for (Map.Entry<String, Map<Integer,Long>> _iter123 : this.transferred.entrySet())
        {
          oprot.writeString(_iter123.getKey());
          {
            oprot.writeMapBegin(new org.apache.thrift7.protocol.TMap(org.apache.thrift7.protocol.TType.I32, org.apache.thrift7.protocol.TType.I64, _iter123.getValue().size()));
            for (Map.Entry<Integer, Long> _iter124 : _iter123.getValue().entrySet())
            {
              oprot.writeI32(_iter124.getKey());
              oprot.writeI64(_iter124.getValue());
            }
            oprot.writeMapEnd();
          }
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.specific != null) {
      oprot.writeFieldBegin(SPECIFIC_FIELD_DESC);
      this.specific.write(oprot);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TaskStats(");
    boolean first = true;

    sb.append("emitted:");
    if (this.emitted == null) {
      sb.append("null");
    } else {
      sb.append(this.emitted);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("transferred:");
    if (this.transferred == null) {
      sb.append("null");
    } else {
      sb.append(this.transferred);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("specific:");
    if (this.specific == null) {
      sb.append("null");
    } else {
      sb.append(this.specific);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift7.TException {
    // check for required fields
    if (!is_set_emitted()) {
      throw new org.apache.thrift7.protocol.TProtocolException("Required field 'emitted' is unset! Struct:" + toString());
    }

    if (!is_set_transferred()) {
      throw new org.apache.thrift7.protocol.TProtocolException("Required field 'transferred' is unset! Struct:" + toString());
    }

    if (!is_set_specific()) {
      throw new org.apache.thrift7.protocol.TProtocolException("Required field 'specific' is unset! Struct:" + toString());
    }

  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift7.protocol.TCompactProtocol(new org.apache.thrift7.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift7.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift7.protocol.TCompactProtocol(new org.apache.thrift7.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift7.TException te) {
      throw new java.io.IOException(te);
    }
  }

}

