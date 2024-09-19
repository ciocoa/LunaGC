// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayerHomeCompInfoNotify.proto

package emu.grasscutter.net.proto;

public final class PlayerHomeCompInfoNotifyOuterClass {
  private PlayerHomeCompInfoNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PlayerHomeCompInfoNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PlayerHomeCompInfoNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.PlayerHomeCompInfo comp_info = 4;</code>
     * @return Whether the compInfo field is set.
     */
    boolean hasCompInfo();
    /**
     * <code>.PlayerHomeCompInfo comp_info = 4;</code>
     * @return The compInfo.
     */
    emu.grasscutter.net.proto.PlayerHomeCompInfoOuterClass.PlayerHomeCompInfo getCompInfo();
    /**
     * <code>.PlayerHomeCompInfo comp_info = 4;</code>
     */
    emu.grasscutter.net.proto.PlayerHomeCompInfoOuterClass.PlayerHomeCompInfoOrBuilder getCompInfoOrBuilder();
  }
  /**
   * Protobuf type {@code PlayerHomeCompInfoNotify}
   */
  public static final class PlayerHomeCompInfoNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PlayerHomeCompInfoNotify)
      PlayerHomeCompInfoNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PlayerHomeCompInfoNotify.newBuilder() to construct.
    private PlayerHomeCompInfoNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PlayerHomeCompInfoNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PlayerHomeCompInfoNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PlayerHomeCompInfoNotify(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 34: {
              emu.grasscutter.net.proto.PlayerHomeCompInfoOuterClass.PlayerHomeCompInfo.Builder subBuilder = null;
              if (compInfo_ != null) {
                subBuilder = compInfo_.toBuilder();
              }
              compInfo_ = input.readMessage(emu.grasscutter.net.proto.PlayerHomeCompInfoOuterClass.PlayerHomeCompInfo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(compInfo_);
                compInfo_ = subBuilder.buildPartial();
              }

              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.PlayerHomeCompInfoNotifyOuterClass.internal_static_PlayerHomeCompInfoNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.PlayerHomeCompInfoNotifyOuterClass.internal_static_PlayerHomeCompInfoNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.PlayerHomeCompInfoNotifyOuterClass.PlayerHomeCompInfoNotify.class, emu.grasscutter.net.proto.PlayerHomeCompInfoNotifyOuterClass.PlayerHomeCompInfoNotify.Builder.class);
    }

    public static final int COMP_INFO_FIELD_NUMBER = 4;
    private emu.grasscutter.net.proto.PlayerHomeCompInfoOuterClass.PlayerHomeCompInfo compInfo_;
    /**
     * <code>.PlayerHomeCompInfo comp_info = 4;</code>
     * @return Whether the compInfo field is set.
     */
    @java.lang.Override
    public boolean hasCompInfo() {
      return compInfo_ != null;
    }
    /**
     * <code>.PlayerHomeCompInfo comp_info = 4;</code>
     * @return The compInfo.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.PlayerHomeCompInfoOuterClass.PlayerHomeCompInfo getCompInfo() {
      return compInfo_ == null ? emu.grasscutter.net.proto.PlayerHomeCompInfoOuterClass.PlayerHomeCompInfo.getDefaultInstance() : compInfo_;
    }
    /**
     * <code>.PlayerHomeCompInfo comp_info = 4;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.PlayerHomeCompInfoOuterClass.PlayerHomeCompInfoOrBuilder getCompInfoOrBuilder() {
      return getCompInfo();
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (compInfo_ != null) {
        output.writeMessage(4, getCompInfo());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (compInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, getCompInfo());
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.PlayerHomeCompInfoNotifyOuterClass.PlayerHomeCompInfoNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.PlayerHomeCompInfoNotifyOuterClass.PlayerHomeCompInfoNotify other = (emu.grasscutter.net.proto.PlayerHomeCompInfoNotifyOuterClass.PlayerHomeCompInfoNotify) obj;

      if (hasCompInfo() != other.hasCompInfo()) return false;
      if (hasCompInfo()) {
        if (!getCompInfo()
            .equals(other.getCompInfo())) return false;
      }
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasCompInfo()) {
        hash = (37 * hash) + COMP_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getCompInfo().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.PlayerHomeCompInfoNotifyOuterClass.PlayerHomeCompInfoNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerHomeCompInfoNotifyOuterClass.PlayerHomeCompInfoNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerHomeCompInfoNotifyOuterClass.PlayerHomeCompInfoNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerHomeCompInfoNotifyOuterClass.PlayerHomeCompInfoNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerHomeCompInfoNotifyOuterClass.PlayerHomeCompInfoNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerHomeCompInfoNotifyOuterClass.PlayerHomeCompInfoNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerHomeCompInfoNotifyOuterClass.PlayerHomeCompInfoNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerHomeCompInfoNotifyOuterClass.PlayerHomeCompInfoNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerHomeCompInfoNotifyOuterClass.PlayerHomeCompInfoNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerHomeCompInfoNotifyOuterClass.PlayerHomeCompInfoNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerHomeCompInfoNotifyOuterClass.PlayerHomeCompInfoNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerHomeCompInfoNotifyOuterClass.PlayerHomeCompInfoNotify parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.PlayerHomeCompInfoNotifyOuterClass.PlayerHomeCompInfoNotify prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code PlayerHomeCompInfoNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PlayerHomeCompInfoNotify)
        emu.grasscutter.net.proto.PlayerHomeCompInfoNotifyOuterClass.PlayerHomeCompInfoNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.PlayerHomeCompInfoNotifyOuterClass.internal_static_PlayerHomeCompInfoNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.PlayerHomeCompInfoNotifyOuterClass.internal_static_PlayerHomeCompInfoNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.PlayerHomeCompInfoNotifyOuterClass.PlayerHomeCompInfoNotify.class, emu.grasscutter.net.proto.PlayerHomeCompInfoNotifyOuterClass.PlayerHomeCompInfoNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.PlayerHomeCompInfoNotifyOuterClass.PlayerHomeCompInfoNotify.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (compInfoBuilder_ == null) {
          compInfo_ = null;
        } else {
          compInfo_ = null;
          compInfoBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.PlayerHomeCompInfoNotifyOuterClass.internal_static_PlayerHomeCompInfoNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerHomeCompInfoNotifyOuterClass.PlayerHomeCompInfoNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.PlayerHomeCompInfoNotifyOuterClass.PlayerHomeCompInfoNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerHomeCompInfoNotifyOuterClass.PlayerHomeCompInfoNotify build() {
        emu.grasscutter.net.proto.PlayerHomeCompInfoNotifyOuterClass.PlayerHomeCompInfoNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerHomeCompInfoNotifyOuterClass.PlayerHomeCompInfoNotify buildPartial() {
        emu.grasscutter.net.proto.PlayerHomeCompInfoNotifyOuterClass.PlayerHomeCompInfoNotify result = new emu.grasscutter.net.proto.PlayerHomeCompInfoNotifyOuterClass.PlayerHomeCompInfoNotify(this);
        if (compInfoBuilder_ == null) {
          result.compInfo_ = compInfo_;
        } else {
          result.compInfo_ = compInfoBuilder_.build();
        }
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.PlayerHomeCompInfoNotifyOuterClass.PlayerHomeCompInfoNotify) {
          return mergeFrom((emu.grasscutter.net.proto.PlayerHomeCompInfoNotifyOuterClass.PlayerHomeCompInfoNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.PlayerHomeCompInfoNotifyOuterClass.PlayerHomeCompInfoNotify other) {
        if (other == emu.grasscutter.net.proto.PlayerHomeCompInfoNotifyOuterClass.PlayerHomeCompInfoNotify.getDefaultInstance()) return this;
        if (other.hasCompInfo()) {
          mergeCompInfo(other.getCompInfo());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.PlayerHomeCompInfoNotifyOuterClass.PlayerHomeCompInfoNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.PlayerHomeCompInfoNotifyOuterClass.PlayerHomeCompInfoNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private emu.grasscutter.net.proto.PlayerHomeCompInfoOuterClass.PlayerHomeCompInfo compInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.PlayerHomeCompInfoOuterClass.PlayerHomeCompInfo, emu.grasscutter.net.proto.PlayerHomeCompInfoOuterClass.PlayerHomeCompInfo.Builder, emu.grasscutter.net.proto.PlayerHomeCompInfoOuterClass.PlayerHomeCompInfoOrBuilder> compInfoBuilder_;
      /**
       * <code>.PlayerHomeCompInfo comp_info = 4;</code>
       * @return Whether the compInfo field is set.
       */
      public boolean hasCompInfo() {
        return compInfoBuilder_ != null || compInfo_ != null;
      }
      /**
       * <code>.PlayerHomeCompInfo comp_info = 4;</code>
       * @return The compInfo.
       */
      public emu.grasscutter.net.proto.PlayerHomeCompInfoOuterClass.PlayerHomeCompInfo getCompInfo() {
        if (compInfoBuilder_ == null) {
          return compInfo_ == null ? emu.grasscutter.net.proto.PlayerHomeCompInfoOuterClass.PlayerHomeCompInfo.getDefaultInstance() : compInfo_;
        } else {
          return compInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.PlayerHomeCompInfo comp_info = 4;</code>
       */
      public Builder setCompInfo(emu.grasscutter.net.proto.PlayerHomeCompInfoOuterClass.PlayerHomeCompInfo value) {
        if (compInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          compInfo_ = value;
          onChanged();
        } else {
          compInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.PlayerHomeCompInfo comp_info = 4;</code>
       */
      public Builder setCompInfo(
          emu.grasscutter.net.proto.PlayerHomeCompInfoOuterClass.PlayerHomeCompInfo.Builder builderForValue) {
        if (compInfoBuilder_ == null) {
          compInfo_ = builderForValue.build();
          onChanged();
        } else {
          compInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.PlayerHomeCompInfo comp_info = 4;</code>
       */
      public Builder mergeCompInfo(emu.grasscutter.net.proto.PlayerHomeCompInfoOuterClass.PlayerHomeCompInfo value) {
        if (compInfoBuilder_ == null) {
          if (compInfo_ != null) {
            compInfo_ =
              emu.grasscutter.net.proto.PlayerHomeCompInfoOuterClass.PlayerHomeCompInfo.newBuilder(compInfo_).mergeFrom(value).buildPartial();
          } else {
            compInfo_ = value;
          }
          onChanged();
        } else {
          compInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.PlayerHomeCompInfo comp_info = 4;</code>
       */
      public Builder clearCompInfo() {
        if (compInfoBuilder_ == null) {
          compInfo_ = null;
          onChanged();
        } else {
          compInfo_ = null;
          compInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.PlayerHomeCompInfo comp_info = 4;</code>
       */
      public emu.grasscutter.net.proto.PlayerHomeCompInfoOuterClass.PlayerHomeCompInfo.Builder getCompInfoBuilder() {
        
        onChanged();
        return getCompInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.PlayerHomeCompInfo comp_info = 4;</code>
       */
      public emu.grasscutter.net.proto.PlayerHomeCompInfoOuterClass.PlayerHomeCompInfoOrBuilder getCompInfoOrBuilder() {
        if (compInfoBuilder_ != null) {
          return compInfoBuilder_.getMessageOrBuilder();
        } else {
          return compInfo_ == null ?
              emu.grasscutter.net.proto.PlayerHomeCompInfoOuterClass.PlayerHomeCompInfo.getDefaultInstance() : compInfo_;
        }
      }
      /**
       * <code>.PlayerHomeCompInfo comp_info = 4;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.PlayerHomeCompInfoOuterClass.PlayerHomeCompInfo, emu.grasscutter.net.proto.PlayerHomeCompInfoOuterClass.PlayerHomeCompInfo.Builder, emu.grasscutter.net.proto.PlayerHomeCompInfoOuterClass.PlayerHomeCompInfoOrBuilder> 
          getCompInfoFieldBuilder() {
        if (compInfoBuilder_ == null) {
          compInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.PlayerHomeCompInfoOuterClass.PlayerHomeCompInfo, emu.grasscutter.net.proto.PlayerHomeCompInfoOuterClass.PlayerHomeCompInfo.Builder, emu.grasscutter.net.proto.PlayerHomeCompInfoOuterClass.PlayerHomeCompInfoOrBuilder>(
                  getCompInfo(),
                  getParentForChildren(),
                  isClean());
          compInfo_ = null;
        }
        return compInfoBuilder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:PlayerHomeCompInfoNotify)
    }

    // @@protoc_insertion_point(class_scope:PlayerHomeCompInfoNotify)
    private static final emu.grasscutter.net.proto.PlayerHomeCompInfoNotifyOuterClass.PlayerHomeCompInfoNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.PlayerHomeCompInfoNotifyOuterClass.PlayerHomeCompInfoNotify();
    }

    public static emu.grasscutter.net.proto.PlayerHomeCompInfoNotifyOuterClass.PlayerHomeCompInfoNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PlayerHomeCompInfoNotify>
        PARSER = new com.google.protobuf.AbstractParser<PlayerHomeCompInfoNotify>() {
      @java.lang.Override
      public PlayerHomeCompInfoNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PlayerHomeCompInfoNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PlayerHomeCompInfoNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PlayerHomeCompInfoNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.PlayerHomeCompInfoNotifyOuterClass.PlayerHomeCompInfoNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PlayerHomeCompInfoNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PlayerHomeCompInfoNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036PlayerHomeCompInfoNotify.proto\032\030Player" +
      "HomeCompInfo.proto\"B\n\030PlayerHomeCompInfo" +
      "Notify\022&\n\tcomp_info\030\004 \001(\0132\023.PlayerHomeCo" +
      "mpInfoB\033\n\031emu.grasscutter.net.protob\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.PlayerHomeCompInfoOuterClass.getDescriptor(),
        });
    internal_static_PlayerHomeCompInfoNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PlayerHomeCompInfoNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PlayerHomeCompInfoNotify_descriptor,
        new java.lang.String[] { "CompInfo", });
    emu.grasscutter.net.proto.PlayerHomeCompInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
